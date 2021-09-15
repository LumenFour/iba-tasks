package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ChatAgent.
 */
public final class ChatAgent {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatAgent.class);
    private static String       result = "Это ставит меня в тупик. Задайте другой вопрос.";

    /**
     * Instantiates a new Chat agent.
     */
    public ChatAgent() {
    }

    /**
     * Instantiates a new chat agent.
     *
     * @param result
     *            the result
     */
    public ChatAgent(final String result) {
        ChatAgent.setResult(result);
    }

    /**
     * method answer to output the response.
     */
    public static void answer() {
        ChatAgent.result = "Здравствуй";
        ChatAgent.LOGGER.info("Первый агент ответил: {}\n", ChatAgent.result);
    }

    /**
     * method answer2 to output the response.
     */
    public static void answer2() {
        ChatAgent.result = "Кого я вижу!";
        ChatAgent.LOGGER.info("Второй агент ответил: {}\n", ChatAgent.result);
    }

    /**
     * method answer3 to output the response.
     */
    public static void answer3() {
        ChatAgent.result = "Хорошо, а вы?";
        ChatAgent.LOGGER.info("Третий агент ответил: {}\n", ChatAgent.result);
    }

    /**
     * method answer4 to output the response.
     */
    public static void answer4() {
        ChatAgent.result = "Дождь льет как из ведра";
        ChatAgent.LOGGER.info("Четвертый агент ответил: {}\n", ChatAgent.result);
    }

    /**
     * method answer5 to output the response.
     */
    public static void answer5() {
        ChatAgent.result = "До скорой встречи.";
        ChatAgent.LOGGER.info("Последний агент ответил: {}\n", ChatAgent.result);
    }

    public static void setResult(final String result) {
        ChatAgent.result = result;
    }

    /**
     * String reply.
     *
     * @param question
     *            the question
     * @return the string
     */
    public static String stringReply(final String question) {
        switch (question) {
            case "Привет":
                ChatAgent.answer();
                break;
            case "Привет, сосед":
                ChatAgent.answer2();
                break;
            case "Как поживаете?":
                ChatAgent.answer3();
                break;
            case "Какая на улице погода?":
                ChatAgent.answer4();
                break;
            case "Пока":
                ChatAgent.answer5();
                break;
            default:
                ChatAgent.result = "Расскажите о чем-нибудь другом.";
        }
        return ChatAgent.result;
    }

    public String getResult() {
        return ChatAgent.result;
    }

}
