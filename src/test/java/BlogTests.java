import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests extends BaseUI {

    @Test
    public void testBlogPage() {
        blogPage.clickBlog();
        blogPage.clickKharkov();
        blogPage.clickBack();

        String blogUrl = blogPage.verifyBlogUrl();
        Assert.assertEquals(blogUrl, Data.expectedUrlBlog);
    }

}
