import org.junit.Assert
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun returnsOneWhenPassedOne(){
        val fizzBuzz = FizzBuzz()
        val actual = fizzBuzz.convert(1)
        Assert.assertEquals("1",actual)
    }
}