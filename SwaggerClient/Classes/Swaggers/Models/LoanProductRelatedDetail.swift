//
// LoanProductRelatedDetail.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LoanProductRelatedDetail: Codable {

    public enum InterestPeriodFrequencyType: String, Codable { 
        case days = "DAYS"
        case weeks = "WEEKS"
        case months = "MONTHS"
        case years = "YEARS"
        case wholeTerm = "WHOLE_TERM"
        case invalid = "INVALID"
    }
    public enum InterestMethod: String, Codable { 
        case decliningBalance = "DECLINING_BALANCE"
        case flat = "FLAT"
        case invalid = "INVALID"
    }
    public enum InterestCalculationPeriodMethod: String, Codable { 
        case daily = "DAILY"
        case sameAsRepaymentPeriod = "SAME_AS_REPAYMENT_PERIOD"
        case invalid = "INVALID"
    }
    public enum RepaymentPeriodFrequencyType: String, Codable { 
        case days = "DAYS"
        case weeks = "WEEKS"
        case months = "MONTHS"
        case years = "YEARS"
        case wholeTerm = "WHOLE_TERM"
        case invalid = "INVALID"
    }
    public enum AmortizationMethod: String, Codable { 
        case equalPrincipal = "EQUAL_PRINCIPAL"
        case equalInstallments = "EQUAL_INSTALLMENTS"
        case invalid = "INVALID"
    }
    public var currency: MonetaryCurrency?
    public var principal: Money?
    public var nominalInterestRatePerPeriod: Double?
    public var interestPeriodFrequencyType: InterestPeriodFrequencyType?
    public var annualNominalInterestRate: Double?
    public var interestMethod: InterestMethod?
    public var interestCalculationPeriodMethod: InterestCalculationPeriodMethod?
    public var allowPartialPeriodInterestCalcualtion: Bool?
    public var repayEvery: Int?
    public var repaymentPeriodFrequencyType: RepaymentPeriodFrequencyType?
    public var numberOfRepayments: Int?
    public var graceOnPrincipalPayment: Int?
    public var graceOnInterestPayment: Int?
    public var amortizationMethod: AmortizationMethod?
    public var inArrearsTolerance: Money?
    public var graceOnArrearsAgeing: Int?
    public var interestRecalculationEnabled: Bool?
    public var equalAmortization: Bool?
    public var graceOnDueDate: Int?
    public var arrearsTolerance: Double?

    public init(currency: MonetaryCurrency?, principal: Money?, nominalInterestRatePerPeriod: Double?, interestPeriodFrequencyType: InterestPeriodFrequencyType?, annualNominalInterestRate: Double?, interestMethod: InterestMethod?, interestCalculationPeriodMethod: InterestCalculationPeriodMethod?, allowPartialPeriodInterestCalcualtion: Bool?, repayEvery: Int?, repaymentPeriodFrequencyType: RepaymentPeriodFrequencyType?, numberOfRepayments: Int?, graceOnPrincipalPayment: Int?, graceOnInterestPayment: Int?, amortizationMethod: AmortizationMethod?, inArrearsTolerance: Money?, graceOnArrearsAgeing: Int?, interestRecalculationEnabled: Bool?, equalAmortization: Bool?, graceOnDueDate: Int?, arrearsTolerance: Double?) {
        self.currency = currency
        self.principal = principal
        self.nominalInterestRatePerPeriod = nominalInterestRatePerPeriod
        self.interestPeriodFrequencyType = interestPeriodFrequencyType
        self.annualNominalInterestRate = annualNominalInterestRate
        self.interestMethod = interestMethod
        self.interestCalculationPeriodMethod = interestCalculationPeriodMethod
        self.allowPartialPeriodInterestCalcualtion = allowPartialPeriodInterestCalcualtion
        self.repayEvery = repayEvery
        self.repaymentPeriodFrequencyType = repaymentPeriodFrequencyType
        self.numberOfRepayments = numberOfRepayments
        self.graceOnPrincipalPayment = graceOnPrincipalPayment
        self.graceOnInterestPayment = graceOnInterestPayment
        self.amortizationMethod = amortizationMethod
        self.inArrearsTolerance = inArrearsTolerance
        self.graceOnArrearsAgeing = graceOnArrearsAgeing
        self.interestRecalculationEnabled = interestRecalculationEnabled
        self.equalAmortization = equalAmortization
        self.graceOnDueDate = graceOnDueDate
        self.arrearsTolerance = arrearsTolerance
    }


}

