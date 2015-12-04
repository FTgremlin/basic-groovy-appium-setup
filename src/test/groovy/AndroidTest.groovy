
import devices.Android

class AndroidTest {

    def driver

    void startUp(){
        def android = new Android()

        android.create()
        driver = android.driver
    }

    void navigateToYahoo(){
        driver.get("http://www.yahoo.com/")
    }

}
