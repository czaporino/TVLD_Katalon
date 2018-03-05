import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test.traveldoo.com/auth/sso/saml2/home/SHOP_ABBG')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Page_ABB Group/MyProfile'))

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/CreditCardsLink'))

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/font_Add a credit card'))

WebUI.selectOptionByValue(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/select_Select a credit card'), 'VI', true)

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/input_T_Number'), '4012888888881881')

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/font_expiry date'))

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/input_T_Expiry_Date'), '10/22')

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/input_T_Desc'), 'owd')

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/input_T_First_Name'), 'Lukasz')

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/input_T_Last_Name'), 'Skrzypek')

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/a_Save'))

WebUI.verifyTextPresent('A new credit card has been added to your profile', false)

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/CreditCard/deleteCard'))

WebUI.waitForAlert(0)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Credit card information has been deleted', false)

WebUI.closeBrowser()

