import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

    @Test
    public void testException() {

        NotificationService service = mock(NotificationService.class);

        doThrow(new RuntimeException("Error"))
                .when(service)
                .sendNotification();

        assertThrows(RuntimeException.class, () -> {

            service.sendNotification();

        });

    }

}