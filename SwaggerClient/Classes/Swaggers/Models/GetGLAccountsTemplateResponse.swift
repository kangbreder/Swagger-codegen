//
// GetGLAccountsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetGLAccountsTemplateResponse: Codable {

    public var disabled: Bool?
    public var manualEntriesAllowed: Bool?
    public var type: EnumOptionData?
    public var usage: EnumOptionData?
    public var accountTypeOptions: [EnumOptionData]?
    public var usageOptions: [EnumOptionData]?
    public var assetHeaderAccountOptions: [GLAccountData]?
    public var liabilityHeaderAccountOptions: [GLAccountData]?
    public var equityHeaderAccountOptions: [GLAccountData]?
    public var expenseHeaderAccountOptions: [GLAccountData]?
    public var allowedAssetsTagOptions: [CodeValueData]?
    public var allowedLiabilitiesTagOptions: [CodeValueData]?
    public var allowedEquityTagOptions: [CodeValueData]?
    public var allowedIncomeTagOptions: [CodeValueData]?
    public var allowedExpensesTagOptions: [CodeValueData]?

    public init(disabled: Bool?, manualEntriesAllowed: Bool?, type: EnumOptionData?, usage: EnumOptionData?, accountTypeOptions: [EnumOptionData]?, usageOptions: [EnumOptionData]?, assetHeaderAccountOptions: [GLAccountData]?, liabilityHeaderAccountOptions: [GLAccountData]?, equityHeaderAccountOptions: [GLAccountData]?, expenseHeaderAccountOptions: [GLAccountData]?, allowedAssetsTagOptions: [CodeValueData]?, allowedLiabilitiesTagOptions: [CodeValueData]?, allowedEquityTagOptions: [CodeValueData]?, allowedIncomeTagOptions: [CodeValueData]?, allowedExpensesTagOptions: [CodeValueData]?) {
        self.disabled = disabled
        self.manualEntriesAllowed = manualEntriesAllowed
        self.type = type
        self.usage = usage
        self.accountTypeOptions = accountTypeOptions
        self.usageOptions = usageOptions
        self.assetHeaderAccountOptions = assetHeaderAccountOptions
        self.liabilityHeaderAccountOptions = liabilityHeaderAccountOptions
        self.equityHeaderAccountOptions = equityHeaderAccountOptions
        self.expenseHeaderAccountOptions = expenseHeaderAccountOptions
        self.allowedAssetsTagOptions = allowedAssetsTagOptions
        self.allowedLiabilitiesTagOptions = allowedLiabilitiesTagOptions
        self.allowedEquityTagOptions = allowedEquityTagOptions
        self.allowedIncomeTagOptions = allowedIncomeTagOptions
        self.allowedExpensesTagOptions = allowedExpensesTagOptions
    }


}

