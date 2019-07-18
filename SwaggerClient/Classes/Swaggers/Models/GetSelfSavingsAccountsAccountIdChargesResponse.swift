//
// GetSelfSavingsAccountsAccountIdChargesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSelfSavingsAccountsAccountIdChargesResponse: Codable {

    public var _id: Int?
    public var chargeId: Int?
    public var accountId: Int?
    public var name: String?
    public var chargeTimeType: GetSelfSavingsChargeTimeType?
    public var chargeCalculationType: GetSelfSavingsChargeCalculationType?
    public var percentage: Double?
    public var amountPercentageAppliedTo: Double?
    public var currency: GetSelfSavingsCurrency?
    public var amount: Int?
    public var amountPaid: Int?
    public var amountWaived: Int?
    public var amountWrittenOff: Int?
    public var amountOutstanding: Int?
    public var amountOrPercentage: Int?
    public var penalty: Bool?

    public init(_id: Int?, chargeId: Int?, accountId: Int?, name: String?, chargeTimeType: GetSelfSavingsChargeTimeType?, chargeCalculationType: GetSelfSavingsChargeCalculationType?, percentage: Double?, amountPercentageAppliedTo: Double?, currency: GetSelfSavingsCurrency?, amount: Int?, amountPaid: Int?, amountWaived: Int?, amountWrittenOff: Int?, amountOutstanding: Int?, amountOrPercentage: Int?, penalty: Bool?) {
        self._id = _id
        self.chargeId = chargeId
        self.accountId = accountId
        self.name = name
        self.chargeTimeType = chargeTimeType
        self.chargeCalculationType = chargeCalculationType
        self.percentage = percentage
        self.amountPercentageAppliedTo = amountPercentageAppliedTo
        self.currency = currency
        self.amount = amount
        self.amountPaid = amountPaid
        self.amountWaived = amountWaived
        self.amountWrittenOff = amountWrittenOff
        self.amountOutstanding = amountOutstanding
        self.amountOrPercentage = amountOrPercentage
        self.penalty = penalty
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case chargeId
        case accountId
        case name
        case chargeTimeType
        case chargeCalculationType
        case percentage
        case amountPercentageAppliedTo
        case currency
        case amount
        case amountPaid
        case amountWaived
        case amountWrittenOff
        case amountOutstanding
        case amountOrPercentage
        case penalty
    }


}

