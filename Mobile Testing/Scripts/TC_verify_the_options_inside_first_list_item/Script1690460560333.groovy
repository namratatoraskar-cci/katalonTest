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

Mobile.tap(findTestObject('APIdemo_homePage/objectList_homePage', [('option') : option1]), 30)

Mobile.verifyElementVisible(findTestObject('APIdemo_homePage/object1_list',[('object1List') : Accessibility_Node_Provider]), 30)

Mobile.verifyElementVisible(findTestObject('APIdemo_homePage/object1_list',[('object1List') : Accessibility_Node_Querying]), 30)

Mobile.verifyElementVisible(findTestObject('APIdemo_homePage/object1_list',[('object1List') : Accessibility_Service]), 30)

Mobile.verifyElementVisible(findTestObject('APIdemo_homePage/object1_list',[('object1List') : Custom_View]), 30)

