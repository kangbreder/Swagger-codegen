//
// PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest: Codable {

    public var annualInterestRate: Double?
    public var _description: String?

    public init(annualInterestRate: Double?, _description: String?) {
        self.annualInterestRate = annualInterestRate
        self._description = _description
    }

    public enum CodingKeys: String, CodingKey { 
        case annualInterestRate
        case _description = "description"
    }


}
