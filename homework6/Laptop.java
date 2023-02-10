package homework6;

public class Laptop {
    int id;
    String manufacturer;
    String model;
    String CPU;
    int numberOfCores;
    int RAM;
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
        String CPU,
        int numberOfCores,
        int RAM,
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
        this.CPU = CPU.trim().toLowerCase();
        this.numberOfCores = numberOfCores;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem.trim().toLowerCase();
        this.size = size;
        this.screenResolution = screenResolution.trim().toLowerCase();
        this.matrixTechnology = matrixTechnology.trim().toLowerCase();
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ",\nПроизводитель: " + manufacturer  
        +",\nМодель: " + model  + ",\nПроцессор: " + CPU  
        + ",\nколичество ядер: " + numberOfCores  + ",\nRAM: " + RAM  
        + ",\nHD: " + hardDisk  + ",\nСистема: " + operatingSystem  
        + ",\nРазмер экрана: " + size  + ",\nРазрешение: " 
        + screenResolution  + ",\nТехнология матрицы: " + matrixTechnology 
        + ",\nЦена: " + price + "\n\n";
    }
}
