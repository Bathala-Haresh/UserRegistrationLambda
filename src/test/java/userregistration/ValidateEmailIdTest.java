
package userregistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidateEmailIdTest {
	
		private UserRegistration userRegistration;
		private boolean expectedResult;
		private String emailId;

		public ValidateEmailIdTest(String emailId, boolean expectedResult) {
			super();
			this.expectedResult = expectedResult;
			this.emailId = emailId;
		}

		@Before
		public void initialize() {
			userRegistration = new UserRegistration();
		}

		@Parameterized.Parameters
		public static Collection emailIds_With_ExpectedResult() {
			return Arrays.asList(new Object[][] { { "abc.syz@bl.co.in", true }, { "abc_100@yahoo.com", true },
					{ "abc.100@yahoo.com", true },
					 });
		}
		@Test
		public void givenEmailIds_WhenProper_ShouldReturnExpectedResult() throws UserRegistrationException {
			boolean result = userRegistration.validateEmailId(emailId);
			Assert.assertEquals(this.expectedResult, userRegistration.validateEmailId(emailId));
		}
}
