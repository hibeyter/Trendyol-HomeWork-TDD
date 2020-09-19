import org.assertj.core.api.Java6Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


public class WordCountTest {

    @Test
    public void it_should_return_throw_illegal_exception(){
        //Arrange
        WordCount sut = new WordCount();

        //Act
        Throwable throwable = Java6Assertions.catchThrowable(() -> sut.getCount( null));

        //Assert
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void it_should_return_word_count_size_four(){
        //Arrange
        WordCount sut = new WordCount();
        String example = "This is a test.";
        //Act
        int result = sut.getCount(example);

        //Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void it_should_return_word_count_size_six(){
        //Arrange
        WordCount sut = new WordCount();
        String example = "This is a test and a good test.";
        //Act
        int result = sut.getCount(example);

        //Assert
        assertThat(result).isEqualTo(6);
    }

    @Tag("important")
    @Test
    public void it_should_return_word_count_size_seven(){
        //Arrange
        WordCount sut = new WordCount();
        String example = "This is a test,  ... , . ... and a good test. nice";
        //Act
        int result = sut.getCount(example);

        //Assert
        assertThat(result).isEqualTo(7);
    }
    @Tag("important")
    @Test
    public void it_should_return_word_count_size_three(){
        //Arrange
        WordCount sut = new WordCount();
        String example = "Ali ali a,li ali.";
        //Act
        int result = sut.getCount(example);

        //Assert
        assertThat(result).isEqualTo(3);
    }
}
