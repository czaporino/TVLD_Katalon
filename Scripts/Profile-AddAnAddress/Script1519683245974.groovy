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

WebUI.click(findTestObject('Page_ABB Group/a_My Profile'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/a_address book'))

WebUI.waitForPageLoad(1)

WebUI.verifyTextPresent('This page enables you to update your address book. By default, you should use company delivery addresses, setup by your administrator.', 
    true)

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/font_Add a business address'))

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/input_T_Address_Name'), 'Abb address')

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/input_T_Street_Name'), 'Przy Rondzie')

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/input_T_City_Name'), 'Krakow')

WebUI.setText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/input_T_Postal_Code'), '10-001')

WebUI.selectOptionByValue(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/select_select a country'), 
    'PL', true)

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/input_CB_Default'))

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/AddressBookEdit/a_Save'))

WebUI.verifyElementText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/a_AddressName'), 'Abb address')

WebUI.verifyElementText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/font_AddressDetails'), 'Przy Rondzie')

WebUI.verifyElementText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/font_City'), 'Krakow (10001)')

WebUI.verifyElementText(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/font_Country'), 'Poland')

WebUI.click(findTestObject('Page_ABB Group/MyProfilePage/AddressBook/img'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.closeBrowser()

