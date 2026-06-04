package br.com.marcos.carControl;

public class Car {
    private final String model;
    private boolean isOn;
    private int speed;

    private int gear;

    public int getSpeed() {
        return speed;
    }

    public Car(String model){
        this.model = model;
        this.isOn = false;
        this.speed = 0;
        this.gear = 0;
    }

    public void turnOn(){
        if(isOn){
            System.out.println("Carro já está ligado.");
            return;
        }
        this.isOn = true;
        System.out.println("O carro foi ligado.");
    }

    public void turnOff(){
        if (!isOn){
            System.out.println("Carro já está desligado.");
            return;
        }
        var canTurnOff = speed == 0 && gear == 0;
        if (!canTurnOff){
            System.out.println("Não é possível desligar o carro.\n Velocidade deve ser 0 e marcha deve estar em ponto morto.");
            return;
        }
        isOn = false;
        System.out.println("O carro foi desligado.");
    }

    public void accelerate(){
        if (isOn){
            switch(gear){
                case 0 -> System.out.println("Não é possível acelerar com o carro em ponto morto.");
                case 1 -> accelerateInGear1();
                case 2 -> accelerateInGear2();
                case 3 -> accelerateInGear3();
                case 4 -> accelerateInGear4();
                case 5 -> accelerateInGear5();
                case 6 -> accelerateInGear6();
                default -> System.out.println("Marcha inválida.");
            }
        } else {
            System.out.println("Não é possível acelerar com o carro desligado.");
        }
    }

    public void slowDown(){
        if (isOn){
            switch(gear){
                case 0 -> System.out.println("Não é possível desacelerar com o carro em ponto morto.");
                case 1 -> slowDownInGear1();
                case 2 -> slowDownInGear2();
                case 3 -> slowDownInGear3();
                case 4 -> slowDownInGear4();
                case 5 -> slowDownInGear5();
                case 6 -> slowDownInGear6();
                default -> System.out.println("Marcha inválida.");
            }
        } else {
            System.out.println("Não é possível desacelerar com o carro desligado.");
        }
    }

    public void turnTo(String direction){

        if  (isOn){
            String directionRight = "direita";
            String directionLeft = "esquerda";

            boolean isValidDirection = directionRight.equals(direction.toLowerCase()) || directionLeft.equals(direction.toLowerCase());
            if (!isValidDirection){
                System.out.println("Direção inválida. Use 'direita' ou 'esquerda'.");
                return;
            }

            if (speed >= 1 && speed <= 40){
                System.out.println("O carro virou para " + direction + ".");
            } else {
                System.out.println("Não é possível virar o carro.\n Velocidade deve estar entre 1 km/h e 40 km/h para virar.");
            }
        } else {
            System.out.println("Não é possível virar o carro desligado.");
        }
    }

    public void changeGear(int newGear){
        if (!isOn){
            System.out.println("Não é possível trocar a marcha com o carro desligado.");
            return;
        }
        if (newGear < 0 || newGear > 6){
            System.out.println("Marcha inválida. Use um número entre 0 e 6.");
            return;
        }

        var canChangeGear = Math.abs(newGear - gear) <= 1;
        if (canChangeGear){
            gear = newGear;
        } else {
            var increaseGearAllowed = (gear + 1) > 6 ? "6" : (gear + 1);
            var decreaseGearAllowed = (gear - 1) < 0 ? "0" : (gear - 1);
            System.out.println("Não é possível trocar para a marcha " + newGear + ".\n Você pode trocar para a marcha " + increaseGearAllowed + " ou " + decreaseGearAllowed + " primeiro.");
        }
    }

    private void slowDownInGear6() {
        if (speed >= 100 && speed <= 120){
            speed--;
            displaySlowingCarMessage();
        } else {
            System.out.println("Não é possível desacelerar.\n Velocidade deve estar entre 101 km/h e 120 km/h para a 6ª marcha.");
        }
    }

    private void slowDownInGear5() {
        if (speed >= 81 && speed <= 100){
            speed--;
            displaySlowingCarMessage();
        } else {
            System.out.println("Não é possível desacelerar.\n Velocidade deve estar entre 81 km/h e 100 km/h para a 5ª marcha.");
        }
    }

    private void slowDownInGear4() {
        if (speed >= 61 && speed <= 80){
            speed--;
            displaySlowingCarMessage();
        } else {
            System.out.println("Não é possível desacelerar.\n Velocidade deve estar entre 61 km/h e 80 km/h para a 4ª marcha.");
        }
    }

    private void slowDownInGear3() {
        if (speed >= 41 && speed <= 60){
            speed--;
            displaySlowingCarMessage();
        } else {
            System.out.println("Não é possível desacelerar.\n Velocidade deve estar entre 41 km/h e 60 km/h para a 3ª marcha.");
        }
    }

    private void slowDownInGear2() {
        if (speed >= 21 && speed <= 40){
            speed--;
            displaySlowingCarMessage();
        } else {
            System.out.println("Não é possível desacelerar.\n Velocidade deve estar entre 21 km/h e 40 km/h para a 2ª marcha.");
        }
    }

    private void slowDownInGear1() {
        if (speed > 0 && speed <= 20) {
            speed--;
            displaySlowingCarMessage();
        } else {
            System.out.println("Não é possível desacelerar.\n Velocidade deve estar entre 0 km/h e 20 km/h para a 1ª marcha.");
        }
    }

    private void accelerateInGear6() {
        if (speed >= 100 && speed < 120){
            speed++;
            displayMessageAcceleratedCar();
        } else {
            System.out.println("Não é possível acelerar.\n Velocidade deve estar entre 100 km/h e 120 km/h para a 6ª marcha.");
        }
    }

    private void accelerateInGear5() {
        if (speed >= 80 && speed < 100){
            speed++;
            displayMessageAcceleratedCar();
        } else {
            System.out.println("Não é possível acelerar.\n Velocidade deve estar entre 80 km/h e 99 km/h para a 5ª marcha.");
        }
    }

    private void accelerateInGear4() {
        if (speed >= 60 && speed < 80){
            speed++;
            displayMessageAcceleratedCar();
        } else {
            System.out.println("Não é possível acelerar.\n Velocidade deve estar entre 60 km/h e 79 km/h para a 4ª marcha.");
        }
    }

    private void accelerateInGear3() {
        if (speed >= 40 && speed < 60){
            speed++;
            displayMessageAcceleratedCar();
        } else {
            System.out.println("Não é possível acelerar.\n Velocidade deve estar entre 40 km/h e 59 km/h para a 3ª marcha.");
        }
    }

    private void accelerateInGear2() {
        if (speed >= 20 && speed < 40){
            speed++;
            displayMessageAcceleratedCar();
        } else {
            System.out.println("Não é possível acelerar.\n Velocidade deve estar entre 20 km/h e 39 km/h para a 2ª marcha.");
        }
    }

    private void accelerateInGear1() {
        if (speed >= 0 && speed < 20) {
            speed++;
            displayMessageAcceleratedCar();
        } else {
            System.out.println("Não é possível acelerar.\n Velocidade deve estar entre 0 km/h e 19 km/h para a 1ª marcha.");
        }
    }

    private void displayMessageAcceleratedCar() {
        System.out.println("O carro foi acelerado.\n Velocidade atual: " + speed + " km/h");
    }

    private void displaySlowingCarMessage() {
        System.out.println("O carro foi desacelerado.\n Velocidade atual: " + speed + " km/h");
    }


}
