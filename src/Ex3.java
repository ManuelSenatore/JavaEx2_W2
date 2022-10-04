import java.util.*;

public class Ex3 {
    HashMap<String, Integer> rubrica = new HashMap<>();

    public void setContatto(String name, Integer number){

        rubrica.put(name, number);
        for(Map.Entry contatto : rubrica.entrySet()){
            System.out.println("Nome: "+ contatto.getKey());
            System.out.println("Numero: " + contatto.getValue());
        }
    }

    public void remContatto(String name){
        rubrica.remove(name);
    }

    public void findContattoByNumber(Integer number){
        if (rubrica.containsValue(number)){
            Set entrySet = rubrica.entrySet();
            Iterator it = entrySet.iterator();
            while(it.hasNext()){
                Map.Entry contatto = (Map.Entry)it.next();

                if (contatto.getValue().equals(number)){
                    System.out.println("Nome: " + contatto.getKey());
                }

            }
        }else{
            System.out.println("nessun contatto trovato");
        }
    }

    public void findContattobyName(String name){
        System.out.println(rubrica.get(name));
    }

    public void getRubrica(){
        for(Map.Entry contatto : rubrica.entrySet()){
            System.out.println("Nome: "+ contatto.getKey());
            System.out.println("Numero: " + contatto.getValue());
        }
    }
}
