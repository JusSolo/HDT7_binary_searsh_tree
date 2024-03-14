package uvg.edu.gt;
//Basado en el ejemplo dado por Michael
public class Association<K extends Comparable<K>, T> implements Comparable<Association<K, T>>{
    /*
       Asociasión de pares adecuada para utilizar con árboles bianarios,
       lo que quiere decir que las llaves son comparable.
     */
    public K key;
    public T data;
    public Association(K cKey, T cData){
        this.key = cKey;
        this.data = cData;
    }
    public int compareTo(Association<K, T> other){
        return this.key.compareTo(other.key);
    }
    public String toString(){
        return key.toString() + ":" + data.toString();
    }
}