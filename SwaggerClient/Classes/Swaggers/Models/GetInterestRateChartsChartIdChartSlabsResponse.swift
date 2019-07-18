//
// GetInterestRateChartsChartIdChartSlabsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetInterestRateChartsChartIdChartSlabsResponse: Codable {

    public var _id: Int?
    public var _description: String?
    public var periodTypes: GetInterestRateChartsTemplatePeriodTypes?
    public var fromPeriod: Int?
    public var toPeriod: Int?
    public var annualInterestRate: Double?
    public var currency: GetInterestRateChartsCurrency?
    public var incentives: [GetInterestRateChartsChartIdChartSlabsIncentives]?

    public init(_id: Int?, _description: String?, periodTypes: GetInterestRateChartsTemplatePeriodTypes?, fromPeriod: Int?, toPeriod: Int?, annualInterestRate: Double?, currency: GetInterestRateChartsCurrency?, incentives: [GetInterestRateChartsChartIdChartSlabsIncentives]?) {
        self._id = _id
        self._description = _description
        self.periodTypes = periodTypes
        self.fromPeriod = fromPeriod
        self.toPeriod = toPeriod
        self.annualInterestRate = annualInterestRate
        self.currency = currency
        self.incentives = incentives
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case _description = "description"
        case periodTypes
        case fromPeriod
        case toPeriod
        case annualInterestRate
        case currency
        case incentives
    }


}

