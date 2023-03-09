package kr.hizju.fileboard.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpFileVO {
	private int idx;
	private int ref;
	private String saveFileName;
	private String originalFileName;
}
