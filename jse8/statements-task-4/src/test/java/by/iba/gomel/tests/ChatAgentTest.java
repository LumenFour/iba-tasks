package by.iba.gomel.tests;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ChatAgent;

public class ChatAgentTest {

    ChatAgent agent = new ChatAgent();

    @Test
    public void testAgent1() {
        new ChatAgent("Привет");
        Assert.assertThat("Проверка первого агента", ChatAgent.stringReply("Привет"),
                Is.is("Здравствуй"));
    }

    @Test
    public void testAgent2() {
        new ChatAgent("Привет, сосед");
        Assert.assertThat("Проверка второго агента", ChatAgent.stringReply("Привет, сосед"),
                Is.is("Кого я вижу!"));
    }

    @Test
    public void testAgent3() {
        new ChatAgent("Как поживаете?");
        Assert.assertThat("Проверка третьего агента", ChatAgent.stringReply("Как поживаете?"),
                Is.is("Хорошо, а вы?"));
    }

    @Test
    public void testAgent4() {
        new ChatAgent("Какая на улице погода?");
        Assert.assertThat("Проверка четвертого агента",
                ChatAgent.stringReply("Какая на улице погода?"), Is.is("Дождь льет как из ведра"));
    }

    @Test
    public void testAgent5() {
        new ChatAgent("Пока");
        Assert.assertThat("Проверка последнего агента", ChatAgent.stringReply("Пока"),
                Is.is("До скорой встречи."));
    }

    @Test
    public void testGetPhrase() {
        ChatAgent.setResult("qq");
        final String s = this.agent.getResult();
        Assert.assertEquals("Error", "qq", s);
    }

    @Test
    public void testUnknownAgent() {
        new ChatAgent("RRr");
        Assert.assertThat("Проверка неизвестного агента",
                ChatAgent.stringReply("Сколько будет 2 + 2?"),
                Is.is("Расскажите о чем-нибудь другом."));
    }
}
