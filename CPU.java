class CPU {
    private double price;

  
    public CPU(double price) {
        this.price = price;
    }

  
    class Processor {
        private int cores;
        private String manufacturer;

   public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
    }

  
    static class RAM {
        private int memory;
        private String manufacturer;

     
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
    }

   
    public void displayPrice() {
      
    }

  
    public static void main(String[] args) {
        
        CPU cpu = new CPU(25000.0);
        cpu.displayPrice();

        
        CPU.Processor processor = cpu.new Processor(8, "Intel");

       
        CPU.RAM ram = new CPU.RAM(16, "Corsair");
    }
}
