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

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('TVLD/MyProfile'))

WebUI.click(findTestObject('TVLD/MyProfilePage/TelephoneNumbersLink'))

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmail'))

WebUI.click(findTestObject('TVLD/MyProfile'))

WebUI.click(findTestObject('TVLD/MyProfilePage/EmailLink'))

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmail'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/BusinessPhone'), '0048-555666777')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/HomePhone'), '0012-657421345')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/MobilePhone'), '0048-111222333')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/PrimaryEmailAddress'), 
    '1234@pl.x.com')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/SecondaryEmailAddress'), 
    '345@pl.x.com')

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/SaveChanges'))

WebUI.verifyTextPresent('Telephone numbers and email have been updated', true)

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/BusinessPhoneVerify'), '0048-555666777')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/HomePhoneVerify'), '0012-657421345')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/MobilePhoneVerify'), '0048-111222333')

not_run: WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/EmailVerify'), '1234@Pl.X.Com , 345@Pl.X.Com')

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmail'))

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/BusinessPhone'), '0048-111111111')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/HomePhone'), '')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/MobilePhone'), '')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/PrimaryEmailAddress'), 
    'qwerty@pl.x.com')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/SecondaryEmailAddress'), 
    '')

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateTelephonesAndEmailPage/SaveChanges'))

WebUI.verifyTextPresent('Telephone numbers and email have been updated', true)

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/BusinessPhoneVerify'), '0048-111111111')

not_run: WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/HomePhoneVerify'), '')

not_run: WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TelephoneAndEmail/MobilePhoneVerify'), '')

WebUI.closeBrowser()

