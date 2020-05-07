package it.panda.chapter2.time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Calendar;

import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.when;

class HelpDeskTest {

    @Mock
    private Calendar calendar;

    @InjectMocks
    private HelpDesk helpDesk;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void should() {
        when(calendar.get(anyInt())).thenReturn(1);
    }
}