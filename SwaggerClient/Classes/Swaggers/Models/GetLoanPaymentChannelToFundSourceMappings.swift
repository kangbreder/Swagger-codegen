//
// GetLoanPaymentChannelToFundSourceMappings.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoanPaymentChannelToFundSourceMappings: Codable {

    public var paymentType: GetLoanPaymentType?
    public var fundSourceAccount: GetLoanFundSourceAccount?

    public init(paymentType: GetLoanPaymentType?, fundSourceAccount: GetLoanFundSourceAccount?) {
        self.paymentType = paymentType
        self.fundSourceAccount = fundSourceAccount
    }


}
