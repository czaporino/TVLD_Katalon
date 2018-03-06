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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test.traveldoo.com/auth/sso/saml2/home/SHOP_ABBG')

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('TVLD/MyProfile'))

WebUI.click(findTestObject('TVLD/MyProfilePage/TelephoneNumbersLink'))

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContact'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/FullName'), '0048-555666777')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/PhoneNumber'), '0012-657421345')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/Country'), 'PL', 
    true)

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/SaveChanges'))

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/EmergencyContact/NameVerify'), '0048-555666777')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/EmergencyContact/PhoneNumberVerify'), '0012-657421345')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/EmergencyContact/CountryVerify'), 'Poland')

WebUI.verifyTextPresent('Emergency contact has been updated', true)

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContact'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/FullName'), '0048-000000000')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/PhoneNumber'), '0012-00000000')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/Country'), 'DE', 
    true)

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/SaveChanges'))

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/EmergencyContact/NameVerify'), '0048-000000000')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/EmergencyContact/PhoneNumberVerify'), '0012-00000000')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/EmergencyContact/CountryVerify'), 'Germany')

WebUI.verifyTextPresent('Emergency contact has been updated', true)

WebUI.closeBrowser()

