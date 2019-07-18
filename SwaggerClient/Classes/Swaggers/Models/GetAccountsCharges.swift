//
// GetAccountsCharges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountsCharges: Codable {

    public var _id: Int?
    public var chargeId: Int?
    public var accountId: Int?
    public var name: String?
    public var chargeTimeType: GetAccountsChargeTimeType?
    public var chargeCalculationType: GetAccountsChargeCalculationType?
    public var percentage: Double?
    public var amountPercentageAppliedTo: Double?
    public var currency: GetAccountsChargesCurrency?
    public var amount: Float?
    public var amountPaid: Float?
    public var amountWaived: Float?
    public var amountWrittenOff: Float?
    public var amountOutstanding: Float?
    public var amountOrPercentage: Float?
    public var isActive: Bool?

    public init(_id: Int?, chargeId: Int?, accountId: Int?, name: String?, chargeTimeType: GetAccountsChargeTimeType?, chargeCalculationType: GetAccountsChargeCalculationType?, percentage: Double?, amountPercentageAppliedTo: Double?, currency: GetAccountsChargesCurrency?, amount: Float?, amountPaid: Float?, amountWaived: Float?, amountWrittenOff: Float?, amountOutstanding: Float?, amountOrPercentage: Float?, isActive: Bool?) {
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
        self.isActive = isActive
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
        case isActive
    }


}

