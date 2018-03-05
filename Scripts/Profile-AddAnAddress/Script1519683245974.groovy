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

WebUI.click(findTestObject('TVLD/MyProfile'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookLink'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/AddBusinessAddress'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/AddressName_b'), 'Abb address')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/StreetName_b'), 'Przy Rondzie')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/City_b'), 'Krakow')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/PostalCode_b'), '10-001')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/Country_b'), 'PL', true)

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/CheckDefaultDeliveryAddress_b'))

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditBusiness/Save_b'))

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressName_b_verify'), 'Abb address')

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressDetails_b_verify'), 'Przy Rondzie')

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/City_b_verify'), 'Krakow (10001)')

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/Country_b_verify'), 'Poland')

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/DeleteAddress_b'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/AddHomeAddress'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/AddressName_h'), 'Krakow Dom')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/Building_h'), '&*($')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/StreetAddress_h'), 'Basztowa 15/25')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/City_h'), 'Kraków')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/StateRegion_h'), 'małopolskie')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/PostalCode_h'), '32261')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/Country_h'), 'PL', true)

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/Save_h'))

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressName_h_verify'), 'Krakow Dom')

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/AddressDetails_h_verify'), 'Basztowa 1525')

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/City_h_verify'), 'Kraków (32261)')

WebUI.verifyElementText(findTestObject('TVLD/MyProfilePage/AddressBook/Country_h_verify'), 'Poland')

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/AddressBookEditHome/CheckDefaultDeliveryAddress_h'))

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBook/DeleteAddress_h'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.closeBrowser()

