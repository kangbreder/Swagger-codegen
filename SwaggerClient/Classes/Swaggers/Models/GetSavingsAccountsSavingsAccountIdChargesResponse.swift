//
// GetSavingsAccountsSavingsAccountIdChargesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsAccountsSavingsAccountIdChargesResponse: Codable {

    public var _id: Int?
    public var chargeId: Int?
    public var accountId: Int?
    public var name: String?
    public var chargeTimeType: GetChargesChargeTimeType?
    public var chargeCalculationType: GetChargesChargeCalculationType?
    public var percentage: Double?
    public var amountPercentageAppliedTo: Double?
    public var currency: GetChargesCurrencyResponse?
    public var amount: Float?
    public var amountPaid: Float?
    public var amountWaived: Float?
    public var amountWrittenOff: Float?
    public var amountOutstanding: Float?
    public var amountOrPercentage: Float?
    public var penalty: Bool?

    public init(_id: Int?, chargeId: Int?, accountId: Int?, name: String?, chargeTimeType: GetChargesChargeTimeType?, chargeCalculationType: GetChargesChargeCalculationType?, percentage: Double?, amountPercentageAppliedTo: Double?, currency: GetChargesCurrencyResponse?, amount: Float?, amountPaid: Float?, amountWaived: Float?, amountWrittenOff: Float?, amountOutstanding: Float?, amountOrPercentage: Float?, penalty: Bool?) {
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

