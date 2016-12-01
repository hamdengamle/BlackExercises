public class Main {

    public static void main(String[] args) {
        QueueRepository namesRepository = new QueueRepository();
        namesRepository.add("smiler1");
        namesRepository.add("smiler2");
        namesRepository.add("smiler3");
        namesRepository.add("smiler4");

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

        StackRepository stack = new StackRepository();
        stack.push("smiler1");
        stack.push("smiler2");
        stack.push("smiler3");
        stack.push("smiler4");

        for(Iterator iter = stack.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
