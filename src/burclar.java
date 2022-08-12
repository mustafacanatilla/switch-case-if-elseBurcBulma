import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {

        int gun, ay;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz:");
        ay = input.nextInt();

        System.out.print("Doğduğunuz Günü Giriniz:");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                } else {
                    System.out.print("Hatalı bir gün girdiniz!");
                }
                break;
            case 2:
                if (gun >= 1 && gun <= 28) {
                    if (gun < 20) {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 3:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 20) {
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Koç Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 4:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 20) {
                        System.out.println("Koç Burcu");
                    } else {
                        System.out.println("Boğa Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 5:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 6:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("İkizler Burcu");
                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 7:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 8:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 22) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 9:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("Başak Burcu");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 10:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 22) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 11:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        System.out.println("Akrep Burcu");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            case 12:
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }
                break;
            default:
                System.out.println("Hatalı bir ay girdiniz!");

                }
        }
    }
