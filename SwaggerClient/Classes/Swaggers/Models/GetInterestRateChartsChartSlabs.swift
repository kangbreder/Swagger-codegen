//
// GetInterestRateChartsChartSlabs.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetInterestRateChartsChartSlabs: Codable {

    public var _id: Int?
    public var periodTypes: GetInterestRateChartsTemplatePeriodTypes?
    public var fromPeriod: Int?
    public var annualInterestRate: Int?
    public var currency: GetInterestRateChartsCurrency?

    public init(_id: Int?, periodTypes: GetInterestRateChartsTemplatePeriodTypes?, fromPeriod: Int?, annualInterestRate: Int?, currency: GetInterestRateChartsCurrency?) {
        self._id = _id
        self.periodTypes = periodTypes
        self.fromPeriod = fromPeriod
        self.annualInterestRate = annualInterestRate
        self.currency = currency
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case periodTypes
        case fromPeriod
        case annualInterestRate
        case currency
    }


}
