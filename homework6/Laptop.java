package homework6;

import java.util.HashSet;

public class Laptop {
    int id;
    String manufacturer;
    String model;
    String color;
    String CPU;
    int numberOfCores;
    double freq;
    int RAM;
    String kindOfMemory;
    int hardDisk;
    String operatingSystem;
    double size;
    String screenResolution;
    String matrixTechnology;
    int price;

    public Laptop(
        int id,
        String manufacturer,
        String model,
        String color,
        String CPU,
        int numberOfCores,
        double freq,
        int RAM,
        String kindOfMemory,
        int hardDisk,
        String operatingSystem,
        double size,
        String screenResolution,
        String matrixTechnology,
        int price
    ) {
        this.id = id;
        this.manufacturer = manufacturer.trim().toLowerCase();
        this.model = model.trim().toLowerCase();
        this.color = color;
        this.CPU = CPU.trim().toLowerCase();
        this.numberOfCores = numberOfCores;
        this.freq = freq;
        this.RAM = RAM;
        this.kindOfMemory = kindOfMemory.trim().toLowerCase();
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem.trim().toLowerCase();
        this.size = size;
        this.screenResolution = screenResolution.trim().toLowerCase();
        this.matrixTechnology = matrixTechnology.trim().toLowerCase();
        this.price = price;
    }

    public String toString() {
        return "\n******* ID: " + id + ",\nПроизводитель: " 
        + manufacturer +",\nМодель: " + model  + ",\nЦвет: " + color  
        + ",\nПроцессор: " + CPU + ",\nКоличество ядер: " + numberOfCores +
         ",\nЧастота: " + freq + ",\nRAM: " + RAM + ",\nВид памяти: " 
        + kindOfMemory + ",\nHD: " + hardDisk  + ",\nСистема: " 
        + operatingSystem + ",\nРазмер экрана: " + size  + ",\nРазрешение: " 
        + screenResolution  + ",\nТехнология матрицы: " + matrixTechnology 
        + ",\nЦена: " + price;
    }

    public static HashSet<Laptop> findLaptopByParam(HashSet<Laptop> inputSet, int key, String value) {
        HashSet<Laptop> result = new HashSet<Laptop>();
        if (key == 1) {
            for (Laptop item : inputSet) {
                if (item.manufacturer.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 2) {
            for (Laptop item : inputSet) {
                if (item.color.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 3) {
            String[] arr = value.split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[1]);
            if (min > max) {
                int temp = max;
                max = min;
                min = temp;
            }
            for (Laptop item : inputSet) {
                if (min <= item.numberOfCores && item.numberOfCores <= max) {
                    result.add(item);
                }
            }
        } else if (key == 4) {
            String[] arr = value.split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[1]);
            if (min > max) {
            int temp = max;
                max = min;
                min = temp;
            }
            for (Laptop item : inputSet) {
                if (min <= item.RAM && item.RAM <= max) {
                    result.add(item);
                }
            }
        } else if (key == 5) {
            for (Laptop item : inputSet) {
                if (item.kindOfMemory.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 6) {
            String[] arr = value.split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[1]);
            if (min > max) {
            int temp = max;
                max = min;
                min = temp;
            }
            for (Laptop item : inputSet) {
                if (min <= item.hardDisk && item.hardDisk <= max) {
                    result.add(item);
                }
            }
        } else if (key == 7) {
            for (Laptop item : inputSet) {
                if (item.operatingSystem.equals(value)) {
                    result.add(item);
                }
            }
        } else if (key == 8) {
            String[] arr = value.split(" ");
            double min = Double.parseDouble(arr[0]);
            double max = Double.parseDouble(arr[1]);
            if (min > max) {
            double temp = max;
                max = min;
                min = temp;
            }
            for (Laptop item : inputSet) {
                if (min <= item.size && item.size <= max) {
                    result.add(item);
                }
            }

        } else if (key == 9) {
            String[] arr = value.split(" ");
            int min = Integer.parseInt(arr[0]);
            int max = Integer.parseInt(arr[1]);
            if (min > max) {
            int temp = max;
                max = min;
                min = temp;
            }
            for (Laptop item : inputSet) {
                if (min <= item.price && item.price <= max) {
                    result.add(item);
                }
            }
        }
        return result;
    }
/*     public static int checkStringforNum(String input) {
        if (input.isEmpty() || !input.matches("[-+]?\\d+")) {
            return -1;
        } else {
            return Integer.parseInt(input);
        }
    }
    public static double checkStringforNumDouble(String input) {
        if (input.isEmpty() || !input.matches("[-+]?\\d+")) {
            return -1;
        } else {
            return Double.parseDouble(input);
        }
    } */
    
}
