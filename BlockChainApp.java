import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainApp {

    public static void main(String[] args){
        //demonstrate a series of blocks in a chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        //block 1
        String[] initialValues = {"Francis has $700", "Costanza has $550"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The block chain is " + blockChain.toString() + "\n");
        //blockHash=-1391271244

        //block 2
        String[] francisGives = {"Francis gives Costanza $40", "Francis gives Vandalay $60", "Francis gives Jerry $100"};
        Block secondBlock = new Block(francisGives, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The block chain is " + blockChain.toString() + "\n");
        //blockHash=-285387458

        //block 3
        String[] francisGetsSomeBack = {"Costanza gives Francis $10", "Jerry gives Francis $50"};
        Block thirdBlock = new Block(francisGetsSomeBack, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The block chain is " + blockChain.toString() + "\n");
        //blockHash=-576211835
    }

}
