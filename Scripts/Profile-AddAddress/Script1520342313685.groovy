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

WebUI.click(findTestObject('HomePage/MyProfile'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyProfilePage/AddressBookLink'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/AddBusinessAddress'))

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/AddressNameBusiness'), 'Abb address')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/StreetNameBusiness'), 'Przy Rondzie')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/CityBusiness'), 'Krakow')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/PostalCodeBusiness'), '10-001')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/CountryBusiness'), 
    'PL', true)

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/CheckDefaultDeliveryAddressBusiness'))

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/SaveBusiness'))

WebUI.verifyTextPresent('A new address has been added to your address book', true)

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/AddressNameBusinessVerify'), 'Abb address')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/AddressDetailsBusinessVerify'), 'Przy Rondzie')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/CityBusinessVerify'), 'Krakow (10001)')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/CountryBusinessVerify'), 'Poland')

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditBusiness/DeleteAddressBusiness'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/AddHomeAddress'))

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/AddressNameHome'), 'Krakow Dom')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/BuildingHome'), '&*($')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/StreetAddressHome'), 'Basztowa 15/25')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/CityHome'), 'Kraków')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/StateRegionHome'), 'małopolskie')

WebUI.setText(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/PostalCodeHome'), '32261')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/CountryHome'), 'PL', true)

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/CheckDefaultDeliveryAddressHome'))

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/SaveHome'))

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/AddressNameHomeverify'), 'Krakow Dom * ')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/AddressDetailsHomeVerify'), 'Basztowa 1525')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/CityHomeVerify'), 'Kraków (32261)')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Address/CountryHomeVerify'), 'Poland')

WebUI.click(findTestObject('MyProfilePage/AddressBookPage/AddressBookEditHome/DeleteAddressHome'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.verifyTextPresent('The address has been removed from your address book', true)

WebUI.closeBrowser()

