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

WebUI.waitForPageLoad(2)

not_run: WebUI.delay(10)

WebUI.click(findTestObject('TVLD/MyProfile'))

WebUI.click(findTestObject('TVLD/MyProfilePage/CreditCardsLink'))

WebUI.click(findTestObject('TVLD/MyProfilePage/CreditCardsPage/AddCreditCard'))

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/CreditCardsPage/TypeOfCreditCard'), 'VI', true)

WebUI.setText(findTestObject('TVLD/MyProfilePage/CreditCardsPage/CardNumber'), '4012888888881881')

WebUI.setText(findTestObject('TVLD/MyProfilePage/CreditCardsPage/ExpiryDate'), '10/22')

WebUI.setText(findTestObject('TVLD/MyProfilePage/CreditCardsPage/CardDescription'), 'owd')

WebUI.setText(findTestObject('TVLD/MyProfilePage/CreditCardsPage/FirstName'), 'Lukasz')

WebUI.setText(findTestObject('TVLD/MyProfilePage/CreditCardsPage/LastName'), 'Skrzypek')

WebUI.click(findTestObject('TVLD/MyProfilePage/CreditCardsPage/Save'))

WebUI.verifyTextPresent('A new credit card has been added to your profile', true)

WebUI.click(findTestObject('TVLD/MyProfilePage/CreditCardsPage/DeleteCard'))

WebUI.waitForAlert(0)

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Credit card information has been deleted', true)

WebUI.closeBrowser()

