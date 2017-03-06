import com.theironyard.novauc.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by souporman on 3/5/17.
 */
public class ScratchPadTest {

    @Test
    public void TestCountTriple(){
        CountTriple triple = new CountTriple();
        assertTrue(triple.countTriples("XXXskdjojjjsadfjsdl")==2);
    }
    @Test
    public void TestCountYZ(){
        CountYZ countYZ = new CountYZ();
        assertTrue(countYZ.countYZ("day fyyyz")==2);
    }
    @Test
    public void TestEqualsIsNot(){
        EqualsIsNot equalsIsNot = new EqualsIsNot();
        assertTrue(equalsIsNot.equalIsNot("noisxxnotyynotxisi")==true);
    }
    @Test
    public void TestGHappy(){
        GHappy gHappy = new GHappy();
        assertTrue(gHappy.gHappy("xxggyygxx")==false);
    }
    @Test
    public void TestMaxBlock(){
        MaxBlock maxBlock = new MaxBlock();
        assertTrue(maxBlock.maxBlock("abbCCCddBBBxx")==4);
    }
    @Test
    public void TestMakeMiddle(){
        MakeMiddle makeMiddle = new MakeMiddle();
        int[] throwAway={1, 2, 3, 4};
        int[] testThrow={2, 3};
        assertTrue(Arrays.equals(makeMiddle.makeMiddle(throwAway),testThrow));
    }
    @Test
    public void TestMiddleThree(){
        MiddleThree middleThree = new MiddleThree();
        int[] throwAway ={8, 6, 7, 5, 3, 0, 9};
        int[] testThrow ={7,5,3};
        assertTrue(Arrays.equals(middleThree.midThree(throwAway),testThrow));
    }
    @Test
    public void TestPlusTwo(){
        PlusTwo plusTwo = new PlusTwo();
        int[] throwAway ={9, 2};
        int[] throwAwayTwo={3,4};
        int[] testThrow = {9,2,3,4};
        assertTrue(Arrays.equals(plusTwo.plusTwo(throwAway,throwAwayTwo),testThrow));
    }
    @Test
    public void TestRotateLeftThree(){
        RotateLeftThree rotateLeftThree = new RotateLeftThree();
        int[] throwAway ={7,0,0};
        int[] testThrow={0,0,7};
        assertTrue(Arrays.equals(rotateLeftThree.rotateLeft3(throwAway),testThrow));
    }
    @Test
    public void TestBlackJack(){
        BlackJack blackJack = new BlackJack();
        assertTrue(blackJack.blackjack(17,22)==17);
    }
    @Test
    public void TestLoneSum(){
        LoneSum loneSum = new LoneSum();

        assertTrue(loneSum.loneSum(17,17,17)==0);
    }
    @Test
    public void TestWordsWithoutList(){
        WordsWithoutList wordsWithoutList = new WordsWithoutList();
//        wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
        String[] throwAway ={"a", "bb", "b", "ccc"};
        ArrayList testThrow =new ArrayList();
        testThrow.add("bb");
        testThrow.add("ccc");
//        wordsWithoutList.wordsWithoutList(throwAway,1).

        assertTrue(wordsWithoutList.wordsWithoutList(throwAway,1).containsAll(testThrow));
    }
    @Test
    public void TestWordsFront(){
        WordsFront wordsFront = new WordsFront();
        String[] throwAway ={"a", "b", "c", "d"};
        String[] testThrow={"a", "b", "c"};
        assertTrue(Arrays.equals(wordsFront.wordsFront(throwAway,3),(testThrow)));
    }
    @Test
    public void TestHasOne(){
        HasOne hasOne = new HasOne();
        assertTrue(hasOne.hasOne(202421763)==true);
    }
    @Test
    public void TestSquareUp(){
        SquareUp squareUp = new SquareUp();
        int[] test ={0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1};
        assertTrue(Arrays.equals(test,(squareUp.squareUp(4))));
    }
    @Test
    public void TestSeriesUp(){
        SeriesUp seriesUp = new SeriesUp();
        int[] test={1, 1, 2, 1, 2, 3};
        assertTrue(Arrays.equals(test,(seriesUp.seriesUp(3))));
    }

}
