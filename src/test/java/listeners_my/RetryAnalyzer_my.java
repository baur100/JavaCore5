package listeners_my;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer_my implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }


}
