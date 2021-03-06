//
// LoanProductConfigurableAttributes.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LoanProductConfigurableAttributes: Codable {

    public var _id: Int64?
    public var loanProduct: LoanProduct?
    public var amortizationBoolean: Bool?
    public var interestMethodBoolean: Bool?
    public var transactionProcessingStrategyBoolean: Bool?
    public var interestCalcPeriodBoolean: Bool?
    public var arrearsToleranceBoolean: Bool?
    public var repaymentEveryBoolean: Bool?
    public var graceOnPrincipalAndInterestPaymentBoolean: Bool?
    public var graceOnArrearsAgingBoolean: Bool?
    public var new: Bool?

    public init(_id: Int64?, loanProduct: LoanProduct?, amortizationBoolean: Bool?, interestMethodBoolean: Bool?, transactionProcessingStrategyBoolean: Bool?, interestCalcPeriodBoolean: Bool?, arrearsToleranceBoolean: Bool?, repaymentEveryBoolean: Bool?, graceOnPrincipalAndInterestPaymentBoolean: Bool?, graceOnArrearsAgingBoolean: Bool?, new: Bool?) {
        self._id = _id
        self.loanProduct = loanProduct
        self.amortizationBoolean = amortizationBoolean
        self.interestMethodBoolean = interestMethodBoolean
        self.transactionProcessingStrategyBoolean = transactionProcessingStrategyBoolean
        self.interestCalcPeriodBoolean = interestCalcPeriodBoolean
        self.arrearsToleranceBoolean = arrearsToleranceBoolean
        self.repaymentEveryBoolean = repaymentEveryBoolean
        self.graceOnPrincipalAndInterestPaymentBoolean = graceOnPrincipalAndInterestPaymentBoolean
        self.graceOnArrearsAgingBoolean = graceOnArrearsAgingBoolean
        self.new = new
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case loanProduct
        case amortizationBoolean
        case interestMethodBoolean
        case transactionProcessingStrategyBoolean
        case interestCalcPeriodBoolean
        case arrearsToleranceBoolean
        case repaymentEveryBoolean
        case graceOnPrincipalAndInterestPaymentBoolean
        case graceOnArrearsAgingBoolean
        case new
    }


}

