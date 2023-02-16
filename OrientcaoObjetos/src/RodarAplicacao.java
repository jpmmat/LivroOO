public class RodarAplicacao {
    public static void main(String[] args){
        
        Veiculo caminhao = new Caminhao();
        Veiculo moto = new Moto();



        Carro carro1 = new Carro();

        carro1.setCor("Red");
        carro1.setModelo("BMW Z4");
        carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Blue", "VOLVO V6", 60);
        
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.39));
    }
}
