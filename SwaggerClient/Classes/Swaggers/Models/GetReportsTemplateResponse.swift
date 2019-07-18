//
// GetReportsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetReportsTemplateResponse: Codable {

    public var allowedReportTypes: [String]?
    public var allowedReportSubTypes: [String]?
    public var allowedParameters: [ReportParameterData]?

    public init(allowedReportTypes: [String]?, allowedReportSubTypes: [String]?, allowedParameters: [ReportParameterData]?) {
        self.allowedReportTypes = allowedReportTypes
        self.allowedReportSubTypes = allowedReportSubTypes
        self.allowedParameters = allowedParameters
    }


}
