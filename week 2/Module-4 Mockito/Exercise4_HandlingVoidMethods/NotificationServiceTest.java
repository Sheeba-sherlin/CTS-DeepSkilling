import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

    @Test
    public void testVoidMethod() {

        NotificationService service = mock(NotificationService.class);

        doNothing().when(service).sendNotification();

        service.sendNotification();

        verify(service).sendNotification();

    }

}