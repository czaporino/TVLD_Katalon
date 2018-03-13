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

WebUI.click(findTestObject('HomePage/Expense'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('ExpensePage/NewExpenseReport'))

WebUI.verifyElementPresent(findTestObject('ExpensePage/CreateNewExpenseSection/button_UserName'), 1)

WebUI.setText(findTestObject('ExpensePage/CreateNewExpenseSection/input_ExpenseReportName'), 'AutomatedExpense')

not_run: WebUI.selectOptionByValue(findTestObject('ExpensePage/CreateNewExpenseSection/button_Purpose'), 'Non-Order Related', 
    false)

not_run: WebUI.selectOptionByValue(findTestObject('ExpensePage/CreateNewExpenseSection/button_TravelReason'), 'Training', 
    false)

not_run: WebUI.setText(findTestObject('ExpensePage/CreateNewExpenseSection/textarea_Comments'), 'Automate expense text')

