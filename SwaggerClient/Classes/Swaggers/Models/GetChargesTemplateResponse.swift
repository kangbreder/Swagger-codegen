//
// GetChargesTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetChargesTemplateResponse: Codable {

    public var active: String?
    public var penalty: String?
    public var currencyOptions: [GetChargesCurrencyResponse]?
    public var chargeCalculationTypeOptions: [GetChargesCalculationTypeResponse]?
    public var chargeAppliesToOptions: [GetChargesAppliesToResponse]?
    public var chargeTimeTypeOptions: [GetChargesTimeTypeResponse]?
    public var chargePaymentModeOptions: [GetChargesPaymentModeResponse]?
    public var loanChargeCalculationTypeOptions: [GetChargesTemplateLoanChargeCalculationTypeOptions]?
    public var loanChargeTimeTypeOptions: [GetChargesTemplateLoanChargeTimeTypeOptions]?
    public var savingsChargeCalculationTypeOptions: [GetChargesTemplateLoanChargeCalculationTypeOptions]?
    public var savingsChargeTimeTypeOptions: [GetChargesTemplateLoanChargeTimeTypeOptions]?
    public var feeFrequencyOptions: [GetChargesTemplateFeeFrequencyOptions]?

    public init(active: String?, penalty: String?, currencyOptions: [GetChargesCurrencyResponse]?, chargeCalculationTypeOptions: [GetChargesCalculationTypeResponse]?, chargeAppliesToOptions: [GetChargesAppliesToResponse]?, chargeTimeTypeOptions: [GetChargesTimeTypeResponse]?, chargePaymentModeOptions: [GetChargesPaymentModeResponse]?, loanChargeCalculationTypeOptions: [GetChargesTemplateLoanChargeCalculationTypeOptions]?, loanChargeTimeTypeOptions: [GetChargesTemplateLoanChargeTimeTypeOptions]?, savingsChargeCalculationTypeOptions: [GetChargesTemplateLoanChargeCalculationTypeOptions]?, savingsChargeTimeTypeOptions: [GetChargesTemplateLoanChargeTimeTypeOptions]?, feeFrequencyOptions: [GetChargesTemplateFeeFrequencyOptions]?) {
        self.active = active
        self.penalty = penalty
        self.currencyOptions = currencyOptions
        self.chargeCalculationTypeOptions = chargeCalculationTypeOptions
        self.chargeAppliesToOptions = chargeAppliesToOptions
        self.chargeTimeTypeOptions = chargeTimeTypeOptions
        self.chargePaymentModeOptions = chargePaymentModeOptions
        self.loanChargeCalculationTypeOptions = loanChargeCalculationTypeOptions
        self.loanChargeTimeTypeOptions = loanChargeTimeTypeOptions
        self.savingsChargeCalculationTypeOptions = savingsChargeCalculationTypeOptions
        self.savingsChargeTimeTypeOptions = savingsChargeTimeTypeOptions
        self.feeFrequencyOptions = feeFrequencyOptions
    }


}
