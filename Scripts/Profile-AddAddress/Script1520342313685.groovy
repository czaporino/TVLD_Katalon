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

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/AddBusinessAddress'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/AddressNameBusiness'), 'Abb address')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/StreetNameBusiness'), 'Przy Rondzie')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/CityBusiness'), 'Krakow')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/PostalCodeBusiness'), '10-001')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/CountryBusiness'), 'PL', 
    true)

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/CheckDefaultDeliveryAddressBusiness'))

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/SaveBusiness'))

WebUI.verifyTextPresent('A new address has been added to your address book', true)

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/AddressNameBusinessVerify'), 'Abb address')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/AddressDetailsBusinessVerify'), 'Przy Rondzie')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/CityBusinessVerify'), 'Krakow (10001)')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/CountryBusinessVerify'), 'Poland')

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditBusiness/DeleteAddressBusiness'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/AddHomeAddress'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/AddressNameHome'), 'Krakow Dom')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/BuildingHome'), '&*($')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/StreetAddressHome'), 'Basztowa 15/25')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/CityHome'), 'Kraków')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/StateRegionHome'), 'małopolskie')

WebUI.setText(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/PostalCodeHome'), '32261')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/CountryHome'), 'PL', true)

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/CheckDefaultDeliveryAddressHome'))

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/SaveHome'))

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/AddressNameHomeverify'), 'Krakow Dom')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/AddressDetailsHomeVerify'), 'Basztowa 1525')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/CityHomeVerify'), 'Kraków (32261)')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/Address/CountryHomeVerify'), 'Poland')

WebUI.click(findTestObject('TVLD/MyProfilePage/AddressBookPage/AddressBookEditHome/DeleteAddressHome'))

WebUI.waitForAlert(1)

WebUI.acceptAlert()

WebUI.verifyTextPresent('The address has been removed from your address book', true)

WebUI.closeBrowser()

