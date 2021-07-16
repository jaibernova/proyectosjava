/*copyright
*
*mas informacion en:
*
*/



package model;


/*@vversion 

autor

*/
public class Ejercicios3 {
    /* clase cambia la edad de los usuarios
    */
    private int edad;

    public Ejercicios3() {
        super();
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad) throws Exception{
        this.edad=edad;       
        if (edad<18) {
            throw new Exception("la edad debe ser positiva");
            }
    }

    
}

class Main4{
    public static void main(String[] args) {
        try{
            Ejercicios3 ejercicio = new Ejercicios3();
            ejercicio.setEdad(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}