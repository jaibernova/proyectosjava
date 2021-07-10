package Test;

import model.Owner;

public class Test {

    public void escenarioOwner(){
        Owner owner1 = new Owner("Sendy");
        boolean test1 = assertTrue("sendy",  owner1.getNombre());
        System.out.println((test1)? "paso":"no paso");
    }
    
    public boolean assertTrue(int esperado, int obtenido){
        if (esperado>obtenido){
            return true;
        }
        return false;

    }
    public boolean assertTrue(String esperado, String obtenido){
        if (esperado.equalsIgnoreCase(obtenido)){
            return true;
        }
        return false;
    }
}
