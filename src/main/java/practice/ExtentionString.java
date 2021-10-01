package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtentionString {

    public static void main(String[] args) {
        String fileName = "file.png"; //file.mp4
        ExtentionString extentionString = new ExtentionString();
        String state = extentionString.solution(fileName);

        System.out.println(state);
    }

    private String solution(String fileName) {
        int extentionIndex = fileName.indexOf(".");
        String extention = fileName.substring(extentionIndex);
        return ExtentionType.findType(extention).getExtention();
    }
}

enum ExtentionType {
    IMG("이미지", Arrays.asList("png", "jpg", "gif")),
    VIDEO("동영상", Arrays.asList("mp4", "avi")),
    NONE("정보없음", Collections.EMPTY_LIST);

    private String extention;
    private List<String> extentionTypes;

    ExtentionType(String extention, List<String> extentionTypes) {
        this.extention = extention;
        this.extentionTypes = extentionTypes;
    }

    public static ExtentionType findType(String extention) {
        return Arrays.stream(values())
                .filter(extentionType -> extentionType.hasType(extention))
                .findAny()
                .orElse(NONE);
    }

    private boolean hasType(String extention) {
        return extentionTypes.stream()
                .anyMatch(type -> type.equals(extention));
    }

    public String getExtention() {
        return extention;
    }
}
