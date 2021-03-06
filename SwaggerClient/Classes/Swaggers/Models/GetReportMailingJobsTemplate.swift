//
// GetReportMailingJobsTemplate.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetReportMailingJobsTemplate: Codable {

    public var isActive: Bool?
    public var emailAttachmentFileFormatOptions: [EnumOptionData]?
    public var stretchyReportParamDateOptions: [EnumOptionData]?

    public init(isActive: Bool?, emailAttachmentFileFormatOptions: [EnumOptionData]?, stretchyReportParamDateOptions: [EnumOptionData]?) {
        self.isActive = isActive
        self.emailAttachmentFileFormatOptions = emailAttachmentFileFormatOptions
        self.stretchyReportParamDateOptions = stretchyReportParamDateOptions
    }


}

