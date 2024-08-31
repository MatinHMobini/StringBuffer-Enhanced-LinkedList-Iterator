public class ITIStringBuffer {
    SinglyLinkedList<String> mylist;
    private int lengthholder;
    public ITIStringBuffer() {
        mylist = new SinglyLinkedList<String>();
    }

    public ITIStringBuffer(String  firstString){
        if(firstString == null){
            throw new IllegalArgumentException("the string is null");
        }
        mylist = new SinglyLinkedList<String>();
        mylist.addFirst(firstString);
        lengthholder += firstString.length();

    }

    public void append(String nextString){
        if(nextString == null){
            throw new IllegalArgumentException("the string is null");
        }
        if(mylist.isEmpty() == true){
            lengthholder += nextString.length();
            mylist.addFirst(nextString);
        }

        else{
            lengthholder += nextString.length();
            mylist.add(nextString);
        }
    }

    public String toString(){
        int counter = 0;
        char[] mychar_holder;
        char[] mychar_final;

        mychar_final = new char[lengthholder];



        for(String holder : mylist){

            mychar_holder = holder.toCharArray();

            for(int i = 0; i < (mychar_holder).length; i++){
                mychar_final[counter] = (mychar_holder[i]);
                counter++;

            }

        }
        String myholder = new String(mychar_final);

        return myholder;
    }

}
