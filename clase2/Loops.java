package reto1.clase2;

public class Loops {

        public static void main(String[] args){

//		runFor();
//		runWhile();
//		runDoWhile();

            int total = 0;
            for(int i = 0; i <=12;i++){
                total += i;
            }
            System.out.print(total);
        }

        private static void runFor(){

            System.out.println("***************** Running for loop *******************");


            for(int i = 1; i <= 12; i++){

                System.out.println("========= Table of: "+i+" ========");
                for(int m = 1; m <= 12; m++){

                    int result = i*m;
                    if(result != 9){
                        System.out.println("\t"+i+" x "+m+" = "+result);
                    }
                }
                System.out.println("=========<><><><><><><><>=======\n");
            }

            System.out.println("***************** Endinng for loop *******************");

        }

        private static void runDoWhile(){

            System.out.println("***************** Running do while loop *******************");

            int i = 1;
            do{
                int m = 1;
                System.out.println("========= Table of: "+i+" ========");

                do{
                    int result = i*m;

                    if(result != 9){
                        System.out.println("\t"+i+" x "+m+" = "+result);
                    }

                    m++;
                }while(m <= 12);
                System.out.println("=========<><><><><><><><>=======\n");

                i++;
            }while(i <= 12);

            System.out.println("***************** Endinng do while loop *******************");

        }

        private static void runWhile(){

            System.out.println("***************** Running while loop *******************");

            int i = 1;

            while(i <= 12){
                int m = 1;
                System.out.println("========= Table of: "+i+" ========");

                while(m <= 12){
                    int result = i*m;

                    if(result != 9){
                        System.out.println("\t"+i+" x "+m+" = "+result);
                    }

                    m++;
                }
                System.out.println("=========<><><><><><><><>=======\n");

                i++;
            }

            System.out.println("***************** Endinng while loop *******************");

        }

        private static void msj(String loop){
        
        }

}
