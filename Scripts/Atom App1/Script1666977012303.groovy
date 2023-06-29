import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('org.gamatech.androidclient.app')

Mobile.tap(findTestObject('Object Repository/android.widget.RelativeLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Today (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Monday (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 440pm (1)'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView -  Add Ticket'), 0)

Mobile.tap(findTestObject('android.widget.TextView -  Add Ticket'), 0)

Mobile.verifyElementExist(findTestObject('android.widget.TextView - Pick Seats'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Pick Seats'), 0)

Mobile.tap(findTestObject('android.view.View (3)'), 0)

Mobile.tap(findTestObject('android.view.View (3)'), 0)

Mobile.verifyElementAttributeValue(findTestObject('android.view.View (3)'), 'content-desc', '*selected', 0)

Mobile.tap(findTestObject('android.view.View (4)'), 0)

Mobile.tap(findTestObject('android.view.View (4)'), 0)

Mobile.verifyElementAttributeValue(findTestObject('android.view.View (4)'), 'content-desc', 'selected', 0)

Mobile.closeApplication()

