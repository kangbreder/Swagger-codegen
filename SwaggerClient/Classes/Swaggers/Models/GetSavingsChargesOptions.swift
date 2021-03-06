//
// GetSavingsChargesOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsChargesOptions: Codable {

    public var _id: Int?
    public var name: String?
    public var active: Bool?
    public var penalty: Bool?
    public var currency: GetChargesCurrencyResponse?
    public var amount: Float?
    public var chargeTimeType: GetSavingsChargesChargeTimeType?
    public var chargesAppliesTo: GetChargesAppliesTo?
    public var chargeCalculationType: GetChargesChargeCalculationType?

    public init(_id: Int?, name: String?, active: Bool?, penalty: Bool?, currency: GetChargesCurrencyResponse?, amount: Float?, chargeTimeType: GetSavingsChargesChargeTimeType?, chargesAppliesTo: GetChargesAppliesTo?, chargeCalculationType: GetChargesChargeCalculationType?) {
        self._id = _id
        self.name = name
        self.active = active
        self.penalty = penalty
        self.currency = currency
        self.amount = amount
        self.chargeTimeType = chargeTimeType
        self.chargesAppliesTo = chargesAppliesTo
        self.chargeCalculationType = chargeCalculationType
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case active
        case penalty
        case currency
        case amount
        case chargeTimeType
        case chargesAppliesTo
        case chargeCalculationType
    }


}

