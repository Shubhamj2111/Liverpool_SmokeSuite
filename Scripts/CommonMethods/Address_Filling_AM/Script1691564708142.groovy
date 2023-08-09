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

name = CustomKeywords.'customkeywords.myKeywords.randomString'()

GlobalVariable.TempAddress = name

WebUI.setText(findTestObject('AccountManagement/ShortName_Account'), name)

WebUI.setText(findTestObject('AccountManagement/PostalCode_Account'), '14000')

WebUI.setText(findTestObject('AccountManagement/City_Account'), 'Pune')

WebUI.setText(findTestObject('AccountManagement/StreetName_Account'), 'Balewadi High Street')

WebUI.setText(findTestObject('AccountManagement/ExtNumber_Account'), '5555')

WebUI.setText(findTestObject('AccountManagement/CellPhoneNumber_Account'), '8239592353')

WebUI.setText(findTestObject('AccountManagement/lada_Account'), '234')

WebUI.setText(findTestObject('AccountManagement/personalNumber_Account'), '82938594')

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))
